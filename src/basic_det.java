class patient{
    private String name;
    private String cond;

    public patient(String name, String cond){
        this.name=name;
        this.cond=cond;
    }
    public String getCond(){
        return cond;

    }

    public String getName(){
        return name;
    }
}