# def swap(a:list,b:list,i):
#     a[i],b[i] =b[i],a[i]

# def minmax(a:list,b:list):
#     i=b.index(max(b))
#     while(a[i]<max(b)):
#         swap(a,b,i)
#         i=b.index(max(b))
#     return max(a)*max(b)

# a = eval(input())
# b = eval(input())

# c = minmax(a,b)
# print(c)

# a =  list(map(int,[x for x in input().split(',')]))
# print(a)
        

class node():
    def __init__(self,data=None) -> None:
        self.data = data
        self.next = None

def duplicate(head:node):
    temp = head
    while(temp.next!=None):
        temp2 = temp
        while(temp2.data==temp2.next.data):
            temp2 = temp2.next
        temp.next = temp2.next
        temp = temp.next

        

