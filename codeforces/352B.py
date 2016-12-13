n = int(input())
ls = [int(x) for x in input().split()]

lsd = {}

for i, x in enumerate(ls):
    if x not in lsd:
        lsd[x] = []
    lsd[x].append(i)

print(len(lsd))
for x in sorted(lsd.keys()):
    diff = 0
    if len(lsd[x]) > 1:
        diff = lsd[x][1] - lsd[x][0]
    print(x, diff)
