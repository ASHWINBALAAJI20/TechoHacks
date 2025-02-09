#include<stdio.h>
float fahtoc(float f)
{
float c=(f-32)*(5.0/9.0);
return c;
}
float ctof(float c)
{
    float f=(c*(9.0/5.0)+32);
    return f;
}
void main()
{
    int r = 1;
    while (r == 1)
    {
        int x;
        printf("Enter 1 to convert Fahrenheit to celsius\n");
        printf("Enter 0 to covert celsius to fahrenheit\n");
        scanf("%d", &x);
        if (x == 1)
        {
            float a;
            printf("Enter Fahrenheit value\n");
            scanf("%f", &a);
            printf("%.2f", fahtoc(a));
        }
        else
        {
            float b;
            printf("Enter celsius value\n");
            scanf("%f", &b);
            printf("%.2f", ctof(b));
        }
        printf("\nEnter 1 to continue and 0 to exit\n");
        scanf("%d", &r);
    }
}