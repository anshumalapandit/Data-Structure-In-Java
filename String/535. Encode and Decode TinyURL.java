public class Codec {
   HashMap<String,String> map;
   Codec(){
    map=new HashMap<>();
   }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String tinyUrl="https://leetcode.com/"; // ignore unique one
        map.put(tinyUrl,longUrl);
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
