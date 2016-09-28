
public class LRUCache {

    int c;

    public LRUCache(int capacity) {

        this.c = capacity;

        

    }

    Map<Integer,Integer> m = new LinkedHashMap<Integer,Integer>(c,1,true){

        protected boolean removeEldestEntry(Map.Entry<Integer,Integer> eldest) {

                return m.size() > c;

    }

    

    };

    public int get(int key) {

        if(m.containsKey(Integer.valueOf(key))) {

            return (int)m.get(Integer.valueOf(key));

        }

        else

            return -1;

    }

    public void set(int key, int value) {

            m.put(Integer.valueOf(key), Integer.valueOf(value));

    }

}
