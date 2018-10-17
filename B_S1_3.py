char=input("Enter the character:").lower()
if ord(char)==ord('a') or ord(char)==ord('e') or ord(char)==ord('i') or ord(char)==ord('o') or ord(char)==ord('u'):
    print("Vowels")
else:
    print("Consonants")
