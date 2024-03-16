
class CharacterCountDecorator implements NewsDecorator {
	
    public String performOperation(News news) {
        String content = news.getMessage();
        int charCount = content.length();
        System.out.println("Character Count: " + charCount);
		return Integer.toString(charCount);
    }
}