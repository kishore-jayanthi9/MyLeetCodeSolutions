class Solution
{
    public int reverse(int x)
    {
        int i=0,j=0;
        int temp=x;
        int mod=0, div=0;
        String xs=new String();
        
        if(x== Integer.MAX_VALUE || x==Integer.MIN_VALUE || x==0)
            return 0;
        
        if(x>0 || x<0)
        {
            if(x<0)
                temp=-(x);
            while(temp>=0)
            {
                mod=temp%10;
                div=temp/10;
                xs=xs+Integer.toString(mod);
                temp=div;
                if(temp==0)
                    break;
            }
        }
        if(x<0)
            xs="-"+xs;
        long result1 = Long.parseLong(xs);
        if(result1> Integer.MAX_VALUE || result1< Integer.MIN_VALUE)
            return 0;
        
        int result=Integer.parseInt(xs);
        
        return result;
    }
}
