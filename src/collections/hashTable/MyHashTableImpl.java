package collections.hashTable;

public class MyHashTableImpl implements MyHashTable<String,String>{
    Map map[];
    int noElements;
    MyHashTableImpl()
    {
        map=new Map[20];
        noElements=0;
    }
    @Override
    public String get(String key) {
        for(int i=0;i<map.length;i++)
            if(map[i].key==key)
                return map[i].value;
        return null;
    }

    @Override
    public void put(String key, String value) {
        int found=0;
        for(int i=0;i<noElements;i++)
            if(map[i].key==key)
            {
                map[i].value=value;
                found=1;
            }
        if(found==0)
        {
            map[noElements++]=new Map(key,value);
        }
    }


    @Override
    public void remove(String key) {
        for(int i=0;i<noElements;i++)
            if(map[i].key==key)
            {
                for(int j=i;j<noElements;j--)
                    map[j]=map[j+1];
                noElements--;
            }
    }

    @Override
    public boolean containsKey(String key) {
        for(int i=0;i<noElements;i++)
            if(map[i].key==key)
            {
                return true;
            }
        return false;
    }

    @Override
    public int size() {
        return noElements;
    }
}
