def check_int(n):
    count = 0
    for i in range(10 ** (len(n) - 1), 10 ** len(n)):
        s = str(i)
        if all(n[j] == '?' or s[j] == n[j] for j in range(len(n))):
            count += 1
    return count

t = int(input())
m = [] 
for _ in range(t):
    n = input()
    m.append(check_int(n))

for count in m:
    print(count)
