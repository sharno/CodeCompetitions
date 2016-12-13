n = int(input()) + 1  # add Dima himself
ls = [int(x) for x in input().split()]

a = sum(ls)

print(len([x for x in range(5) if (a + x) % n != 0]))
