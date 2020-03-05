public static void Main(String args[]){
    List <Hero> lists = new ArrayList();
    lists.add("saito");
    lists.add("suzuki");
    for(Hero list : lists){
        System.out.println(list.getName());
    }
}

Map <Hero, Integer> lists = new HashMap(Hero, Integer);
    list.put("saito", 3);
    list.put("suzuki", 7);
    for(Hero key : lists.keyset()){
        int value = lists.get(key);
        System.out.println("てきを倒した数" + value);
}