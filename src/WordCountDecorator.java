
class WordCountDecorator implements NewsDecorator {
	
    public String performOperation(News news) {
        String content = news.getMessage();
        int wordCount = content.split("\\s+").length;
        return Integer.toString(wordCount);
    }
}