package Thread;

 class Food {
	
	private long id;
	private String name;
	private double amount;
	
	public Food() {


}

	public Food(Long id, String name, double amount) {
		
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "food [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
	
	
	
	
}
