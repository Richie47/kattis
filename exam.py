k = int(input())
my_exam = input()
f_exam = input()

#the two exams we input will always have the same length in this case
#use the sum function to add 1 to matches everytime myexam and friends exam matches.
matches = sum([1 for _ in range(len(my_exam)) if my_exam[_] == f_exam[_]])

#use python ternery operator the format is " a if condition else b "
#meaning a will evaluate when the if statement is true otherwise we print out whats after the else.
print(len(my_exam) - (k - matches) if (min(matches, k) < k) else k + len(my_exam) - matches) 
