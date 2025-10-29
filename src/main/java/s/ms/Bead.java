package s.ms;


import java.util.UUID;


class Bead{
        private String id;
        private String name;
        private String philosopher;
        private String quote;
        private String tag;

        public Bead(String id, String name, String philosopher, String quote, String tag) {
            this.id = UUID.randomUUID().toString();
            this.name = name;
        }

        public Bead(String id, String name, String philosopher, String quote) {
            this.id = id;
            this.name = name;
            this.philosopher = philosopher;
            this.quote = quote;
            this.tag = tag;
        }

        public String getId(){return id;}
        public String getName(){return name;}
        public String getPhilosopher(){return philosopher;}
        public String getQuote(){return quote;}
        public String getTag(){return tag;}

        public void setId(String id){
            this.id = id;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setPhilosopher(String philosopher){
            this.philosopher = philosopher;
        }
        public void setQuote(String quote){
            this.quote = quote;
        }
        public void setTag(String tag){
            this.tag = tag;
        }

        public String minToString(){
            return this.getPhilosopher() + "\n" + this.getQuote();
        }
}

