n = int(input())
ls = [int(x) for x in input().split()]
m = int(input())
qs = [int(x) for x in input().split()]

ls_dict = {}
for i, x in enumerate(ls):
    ls_dict[x] = i

vasya = 0
petya = 0

for x in qs:
    vasya += ls_dict[x] + 1
    petya += n - ls_dict[x]

print(vasya, petya)
