class Branch:
    def __init__(self, branch):
        self._branch = branch

    @property
    def next_branch(self):
        return self._next

    @next_branch.setter
    def next_branch(self, new_next):
        self._next = new_next

class BranchList:
    def __init__(self):
        self.head = None

    def insert(self, branch):
        new_branch = Branch(branch)
        new_branch.next_branch = self.head
        self.head = new_branch


    def test_print(self):
        cur = self.head
        while cur is not None:
            cur = cur.next_branch

    def search(self,k):
        cur = self.head
        while cur is not None:
            for i in range(len(cur._branch)):
                if(cur._branch[i] == k and i != 0):
                    return cur._branch[0]

            cur = cur.next_branch

        #if we get to here im assuming that means no match was found
        return -1


b = BranchList()
k = int(input())
path = []
path.append(k)
cur_num = k

while(cur_num != -1): 
    branch = list(map(int,input().split()))
    b.insert(branch)
    cur_num = branch[0] 


while(k != -1):
    k = b.search(k)
    if(k == -1):
       break

    else:
        path.append(k)

b.test_print()
print(*path)

    