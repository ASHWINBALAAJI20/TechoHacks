def fahtocel(fa):
    a=(fa-32)*(5.0/9.0)
    return a
def celtofah(ce):
    b=(ce*(9.0/5.0)+32)
    return b
r=1
while(r==1):
    print("Enter 1 to convert fahrenheit to celsius, 2 to convert celsius to fahrenheit:\n")
    ch=int(input())
    if(ch==1):
        print("Enter fahrenheit value:")
        fa=float(input())
        c=fahtocel(fa)
        print("%.2f"%c)
    else:
        print("Enter celsius value:")
        ce=float(input())
        f=celtofah(ce)
        print("%.2f"%f)
    r=int(input("\nEnter 1 to continue,0 to exit"))        

