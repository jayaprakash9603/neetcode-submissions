class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        com=""
        for i in s:
            if i.isalnum():
                com+=i.lower()
        print(com) 
        s=com
        left=0
        right=len(s)-1

        while left<=right:
            print("index",left,right)
            if s[left]!=s[right]:
                return False
            left+=1
            right-=1
        return True