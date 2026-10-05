for i in range(5):
    print(i)

print("==========================")

for n in range(10,0,-1):
    print(n)

print("==========================")
p=0
while p< 5:
    print(p)
    p+=1

print("====================")
k= 3
while k>0:
    k-=1
    print(k)
print("=====================")
for j in range(0,7):
    print("baris-",j)
print("=======================")
for b in range(0,10,1):
    print("kolom-",b)
print("======================")
angka=6
for t in range(0,10):
    if angka == 11:
        break
    print(angka)
print("membuat segitiga")

for barisan in range(3):
    for kolom in range(3):
        print("*",end=" ")
print()
print("--------------------")
for h in range(5):
    if h==2:
        continue
    print(h)
print("================")
for angka in range(0,10):
    if angka%3 == 1:
        continue
    print(angka)