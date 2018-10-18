char=input("Enter the character:").lower()
if char in 'aeiou':
    print("Vowels")
elif char in 'bcdfghjklmnpqrstvwxyz':
    print("Consonants")
else:
    print("Invalid")
