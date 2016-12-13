import math
n, m = [float(x) for x in input().split()]
ls = [int(x) for x in input().split()]

print(max([(math.ceil(x / m), i + 1) for i, x in enumerate(ls)])[1])
