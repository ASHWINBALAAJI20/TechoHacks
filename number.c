#include<stdio.h>
void main()
{
    int a,choice,r=1;
    while(r==1)
    {
    printf("Enter a number to convert:");
    scanf("%d",&a);
    printf("Enter 2 to convert it to binary\n");
    printf("Enter 8 to covert it to octal\n");
    printf("Enter 16 to covert it to hexadecimal\n");
    printf("Enter a choice to convert\n");
    scanf("%d",&choice);
    if(choice==2)
    {
        int b[100],i;
        for(i=0;a>0;i++)
        {
            b[i]=a%2;
            a/=2;
        }
        for(i=i-1;i>=0;i--)
        {
            printf("%d",b[i]);
        }
    }
    else if(choice==8)
    {
        int b[100],i;
        for(i=0;a>0;i++)
        {
            b[i]=a%8;
            a/=8;
        }
        for(i=i-1;i>=0;i--)
        {
            printf("%d",b[i]);
        }
    }
    else if(choice==16)
    {
        printf("%X",a);
    }
    printf("\nEnter 1 to continue and 0 to exit\n");
    scanf("%d",&r);
    }
}