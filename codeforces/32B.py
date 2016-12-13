a = input()
res = ""
c = 0
while c < len(a):
    if a[c:c + 2] == "--":
        res += "2"
        c += 2
    elif a[c:c + 2] == "-.":
        res += "1"
        c += 2
    else:
        res += "0"
        c += 1

print(res)
