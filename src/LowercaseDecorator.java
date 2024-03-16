

class LowercaseDecorator implements NewsDecorator {
    @Override
    public String performOperation(News news) {
        String content = news.getMessage();
        content = content.toLowerCase();
        return content;
    }
}