class Solution 
{
    public int lengthOfLongestSubstring(String s)
    {
        int i=0,j=0;
        int end=s.length();
        if(end==0)
            return 0;
        HashSet<Character> h1=new HashSet<>();
        boolean flag=false;
        int size=0,fsize=0;
        for(i=0;i<end;i++)
        {
            // System.out.println("i is:"+i+" and character is:"+s.charAt(i));
            h1.add(s.charAt(i));
            for(j=i+1;j<end;j++)
            {
                // System.out.println("=========================");
                // System.out.println("j is:"+j+" and character is:"+s.charAt(j));
                if(!h1.contains(s.charAt(j)))
                {
                    h1.add(s.charAt(j));
                    size=h1.size();
                    if(j==end-1 && i==end-2)
                    {
                        if(size>fsize)
                            return size;
                        else 
                            return fsize;
                    }
                }
                else
                {
                    if(size>fsize)
                        fsize=size;
                    h1.clear();
                    break;
                }
            }
        }
        if(size==0)
            return 1;
        
        return fsize;
    }
}
