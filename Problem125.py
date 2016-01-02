def findSquares(x,diff):
    s=[]
    for d in range(1,diff+1,1):
        y = d
        while y**2<x+1:
            s.append(y**2)
            y+=diff
    return s

def main(x,diff):
    sq = findSquares(x,diff)
    total = 0
    for y in range(1,len(sq)):
        z = y
        temp = sq[z] + sq[z-1]
        while temp < x and z < len(sq)-1:
            if str(temp) == str(temp)[::-1]:
                total += temp
            z += 1
            temp += sq[z]
    print total

count = int(input())
for p in range(count):
    line = raw_input()
    lst = line.split(" ")
    main(int(lst[0]),int(lst[1]))
