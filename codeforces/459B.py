import math

n = int(input())
ls = [int(x) for x in input().split()]

ma = max(ls)
mi = min(ls)

nma = ls.count(ma)
nmi = ls.count(mi)

diff = ma - mi
ways = nma * nmi

if diff == 0:
    ways = sum(range(nma))

print(diff, int(ways))
