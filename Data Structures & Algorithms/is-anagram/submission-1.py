class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        di1={}
        for i in s:
            if i in di1:
                di1[i]+=1
            else:
                di1[i]=1
        for i in t:
            if i in di1 and di1[i]<=0:
                return False
            else:
                if i in di1:
                    di1[i]-=1
                else:
                    return False
        return True