def n_lower_cases(string):
     return sum([int(c.islower()) for c in string])

def n_upper_cases(string):
    return sum([int(c.isupper()) for c in string])

def n_whitespace(string):
    cnt = 0.0
    for c in string:
       if c == '_':
          cnt += 1
    return cnt

string = input()
symb_amt =  n_whitespace(string) + n_lower_cases(string) + n_upper_cases(string)

print(n_whitespace(string) / len(string ))
print(n_lower_cases(string) / len(string))
print(n_upper_cases(string) / len(string))
print( (len(string) - symb_amt) / len(string))
