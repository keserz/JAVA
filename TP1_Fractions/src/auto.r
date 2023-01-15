library(signal)
cut.off = 11
source("velocity-profile.r")
load ("raw-data.bin")

trial.list <- read.csv ("trial-list.csv")
if (ncol (trial.list) != 4)
  trial.list <- read.csv ("trial-list.csv", sep = ";")

exceptions <- read.csv("exceptions.csv")
idx = 1
for (p in exceptions$subject){
  print(paste(p,exceptions$item[idx],exceptions$style[idx],exceptions$take[idx]))
  idx=idx+1
}
idx = 1
for (idx in 0:nrow(exceptions)){
  print(idx)
}
print(nrow(exceptions))

for(n in 1:5) {
  if(n==3) next # skip 3rd iteration and go to next iteration
  print(n)
}

counter = 1
while (counter<=10){
  if (counter==5){
    counter=counter+1
    next
  }
  print (counter)
  counter = counter+1
}

mincut = 2
maxcut = 20
cut.off = 2
currentcut = cut.off

nbRemarkable = 0

while(nbRemarkable != 5){
  if (nbRemarkable < 5){
    mincut = currentcut
    maxcut = 20
    cut.off = (mincut+maxcut) / 2
    source("velocity-profile.r")

    lp.filt <- butter (6, cut.off / (samp.freq / 2), type = "low")

    plot (x.interp, y.interp, pch = 19, cex = 0.1, las = 1, asp = 1,
          main = sprintf ("[%03d] %s %s %s %d", trial, subject, item, style, take),
          xlab = "x (mm)", ylab = "y (mm)")
    plot (t.interp, v.raw, type = "l", las = 2, col = "gray",
          xlab = "time (s)", ylab = "tangential velocity (mm/s)",
          main = sprintf ("cut-off frequency: %.1f Hz", cut.off))
    lines (t.interp, v.filt, col = "red")
    m <- localMaxima(v.filt)
    nbRemarkable = length(m)
  }

  if (nbRemarkable > 5){
    mincut = 2
    maxcut = currentcut
    cut.off = (mincut+maxcut) / 2

    lp.filt <- butter (6, cut.off / (samp.freq / 2), type = "low")

    plot (x.interp, y.interp, pch = 19, cex = 0.1, las = 1, asp = 1,
          main = sprintf ("[%03d] %s %s %s %d", trial, subject, item, style, take),
          xlab = "x (mm)", ylab = "y (mm)")
    plot (t.interp, v.raw, type = "l", las = 2, col = "gray",
          xlab = "time (s)", ylab = "tangential velocity (mm/s)",
          main = sprintf ("cut-off frequency: %.1f Hz", cut.off))
    lines (t.interp, v.filt, col = "red")
    m <- localMaxima(v.filt)
    nbRemarkable = length(m)
  }
}




lp.filt <- butter (6, cut.off / (samp.freq / 2), type = "low")


library (signal)
x <- seq (0, 50)
f <- butter (3, 0.1)
plot (x, pch = 19, col = "gray")
cols = c ("#ff000080", "#0000ff80")
lines (filtfilt(f,x), col = cols [1], lwd = 3)
install.packages ("gsignal")
library (gsignal)
lines (filtfilt(f,x), col = cols [2], lwd = 3)
legend ("topleft", inset = 0.05, col = cols, lwd = 3,
        legend = c ("avec signal", "avec gsignal"))


graphics.off()

plot (x.interp, y.interp, pch = 19, cex = 0.1, las = 1, asp = 1,
      main = sprintf ("[%03d] %s %s %s %d", trial, subject, item, style, take),
      xlab = "x (mm)", ylab = "y (mm)")
plot (t.interp, v.raw, type = "l", las = 2, col = "gray",
      xlab = "time (s)", ylab = "tangential velocity (mm/s)",
      main = sprintf ("cut-off frequency: %.1f Hz", cut.off))
lines (t.interp, v.filt, col = "red")

localMaxima <- function(x) {
  # Use -Inf instead if x is numeric (non-integer)
  y <- diff(c(-.Machine$integer.max, x)) > 0L
  rle(y)$lengths
  y <- cumsum(rle(y)$lengths)
  y <- y[seq.int(1L, length(y), 2L)]
  if (x[[1]] == x[[2]]) {
    y <- y[-1]
  }
  y
}

localMinima <- function(x) {
  # Use -Inf instead if x is numeric (non-integer)
  y <- diff(c(.Machine$integer.max, x)) > 0L
  rle(y)$lengths
  y <- cumsum(rle(y)$lengths)
  y <- y[seq.int(1L, length(y), 2L)]
  if (x[[1]] == x[[2]]) {
    y <- y[-1]
  }
  y
}


max <- localMaxima(v.filt)
max

min <- localMinima(v.filt)
min

plot(v.filt)
points(max, v.filt[max], pch=19, col="red")
points(min, v.filt[min], pch=19, col="green")

m
v.filt[m]

# seuil de vitesse, on ne demarre pas la detection des maxima tant que la vitesse n'a pas atteind ce seuil

mesure <- read.csv("measurements.csv")
v1 = mesure$v1
d1 = density(v1)
plot(d1)
plot(density(v2), log="", ylim=c(0,max(d1$y)), xlim=c(0.1,max(d2$x)))
v2 = mesure$v2
d2=density(v2)

boxplot(v2)
boxplot(v1,v2,v3,v4,v5)

plot(v3)

lines(d1)

v1minmax = c(min(v1), max(v1))

t1 = mesure$t1
t1minmax = c(min(t1), max(t1))

v3 = mesure$v3
v4 = mesure$v4

v5 = mesure$v5
v5minmax = c(min(v5), max(v5))

t5 = mesure$t5
t5minmax = c(min(t5),max(t5))
boxplot(t5*200)
abline(v=160)

boxplot((t5-t1)*200)

plot(v2/v1, log="y")
abline(h=seq(2,8))

abline(h=max(v.filt)/20)
min

#critere selection premiere vitesse
abline(h=v.filt[max[3]]/4)




decoupage <- function(x){
  max <- local.maxima(x)
  min <- local.minima(x)
  #Premiere etape, il faut trouver le v2, on a determiner 24,
  which(max>24)[1]
  maxi <- max[which(x[max]>24)[1]] # premier pic
  mini <- min[rev(which(min<maxi))[1]] # premier creux

  # plot(v.filt, xlim=c(mini,max(min)))
  # sum(length(min),length(max))
  # minmax = sort(c(min,max))
  # dernier creux, on prend le premier creux qui est en dessous de la vitesse 24

  #decoupe du debut du digramme################################################
  cmp = mini
  check = FALSE
  newv.filt=c()
  while (cmp!=length(x)){
    newv.filt=c(newv.filt, x[cmp])
    cmp=cmp+1
  }
  newv.filt
  # plot(newv.filt)
  newmin <- local.minima(newv.filt)
  newmax <-local.maxima(newv.filt)
  # points(newmax, newv.filt[newmax], pch=19, col="red")
  # points(newmin, newv.filt[newmin], pch=19, col="green")

  #pour couper la fin##############################"
  localmin = 0
  cmp=1
  testindice = c()
  while (localmin<3){
    if (newv.filt[newmin[cmp]]<24){
      localmin=localmin+1

      testindice = c(testindice, newmin[cmp])
    }
    cmp=cmp+1
  }
  max(testindice)

  cmp = 1
  realnewv.filt = c()
  while (cmp<max(testindice)){
    realnewv.filt = c(realnewv.filt, newv.filt[cmp])
    cmp=cmp+1
  }

  plot(realnewv.filt)

  realnewmin <- local.minima(realnewv.filt)
  realnewmax <-local.maxima(realnewv.filt)
  print(realnewmin)
  print(realnewmax)
  points(realnewmax, realnewv.filt[realnewmax], pch=19, col="red")
  points(realnewmin, realnewv.filt[realnewmin], pch=19, col="green")
  m <- sort(c(realnewmin,realnewmax))
  return (m)
}
cut.off = 11
cut.off.min = 2
cut.off.max = 20
cut.off.current = cut.off

source("velocity-profile.r")
m <- decoupage(v.filt)

# #Trouver la premiere frequence avec 5 valeurs
# pas = 0
# while (pas<11){
#   if (length(m)>5){
#     cut.off.min = 2
#     cut.off.max = cut.off.current
#     cut.off = (cut.off.min+cut.off.max)/2
#     cut.off.current = cut.off
#     source("velocity-profile.r")
#     m <- decoupage(v.filt)
#   }
#   if (length(m)<5){
#     cut.off.min = cut.off.current
#     cut.off.max = 20
#     cut.off = (cut.off.min+cut.off.max)/2
#     cut.off.current = cut.off
#     source("velocity-profile.r")
#     m <- decoupage(v.filt)
#   }
#   pas=pas+1
# }
# ##on cherche la frequence max
# pas = 0
# while (length(m)==5 && pas <11){
#   cut.off.finalmax = cut.off.current
#   cut.off = (cut.off.finalmax+cut.off.max)/2
#   cut.off.current = cut.off
#   source("velocity-profile.r")
#   m<- decoupage(v.filt)
#   pas=pas+1
# }
# cut.off = cut.off.finalmax
# cut.off.current = cut.off
# source("velocity-profile.r")
# m<- decoupage(v.filt)
# ## on cherche la frequence min
# pas = 0
# while (length(m)==5 && pas <11){
#   cut.off.finalmin = cut.off.current
#   cut.off = (cut.off.finalmin+cut.off.min)/2
#   cut.off.current = cut.off
#   source("velocity-profile.r")
#   m<- decoupage(v.filt)
#   pas=pas+1
#
# }




# install.packages(ggpmisc)
# library(ggpmisc)
# xax <- 1:length(v.filt)
# xax[ggpmisc:::find_peaks(y)]
# realnewv.filt[ggpmisc:::find_peaks(y)]
#
# df = data.frame(x=xax, y=v.filt)
# plot(df)
# x[ggpmisc:::find_peaks(df$y)]
# y[ggpmisc:::find_peaks(df$y)]
# ggplot(data = df, aes(x = x, y = y)) + geom_line() + stat_peaks(col = "red") + stat_valleys(col="green")
#
# length(realnewv.filt)




max <- localMaxima(v.filt)
min <- localMinima(v.filt)
#Premiere etape, il faut trouver le v2, on a determiner 24,
which(max>24)[1]
maxi <- max[which(v.filt[max]>24)[1]] # premier pic
mini <- min[rev(which(min<maxi))[1]] # premier creux

# plot(v.filt, xlim=c(mini,max(min)))
# sum(length(min),length(max))
# minmax = sort(c(min,max))
# dernier creux, on prend le premier creux qui est en dessous de la vitesse 24

#decoupe du debut du digramme################################################
cmp = mini
check = FALSE
newv.filt=c()
while (cmp!=length(v.filt)){
  newv.filt=c(newv.filt, v.filt[cmp])
  cmp=cmp+1
}
newv.filt
plot(newv.filt)
newmin <- localMinima(newv.filt)
newmax <-localMaxima(newv.filt)
points(newmax, newv.filt[newmax], pch=19, col="red")
points(newmin, newv.filt[newmin], pch=19, col="green")

#pour couper la fin##############################"
localmin = 0
cmp=1
testindice = c()
while (localmin<3){
  if (newv.filt[newmin[cmp]]<24){
    localmin=localmin+1

    testindice = c(testindice, newmin[cmp])
  }
  cmp=cmp+1
}
max(testindice)

cmp = 1
realnewv.filt = c()
while (cmp<max(testindice)){
  realnewv.filt = c(realnewv.filt, newv.filt[cmp])
  cmp=cmp+1
}

plot(realnewv.filt)

realnewmin <- localMinima(realnewv.filt)
realnewmax <-localMaxima(realnewv.filt)
points(realnewmax, realnewv.filt[realnewmax], pch=19, col="red")
points(realnewmin, realnewv.filt[realnewmin], pch=19, col="green")

##################################################################################

abline(v=120+40)
