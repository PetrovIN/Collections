package service;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectionServiceImpl implements CollectionService {
    public String[] splitText(String text) {
        List<String> words = new ArrayList<>();
        String word;
        Pattern pattern = Pattern.compile("\\w+[А-Яа-яA-Za-z]", Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            word = matcher.group().toLowerCase();
            words.add(word);
        }
        return words.toArray(new String[0]);
    }
    @Override
    public Map amountOfRepeats(String text) {
        Map<String, Long> map = new HashMap<>();
        for (String word : splitText(text)) {
            Long count = map.get(word);
            if ( count == null ) {
                count = 0L;
            }
            map.put(word, count + 1);
        }
        return map;
    }

    @Override
    public Set<String> uniqueWords(String text) {
        return new HashSet<>(Arrays.asList(splitText(text)));
    }

    @Override
    public String[] sortByAlphabet(String text) {
        String[] words = splitText(text);
        Arrays.sort(words, Comparator.comparing(String::intern));
        return words;
    }

    @Override
    public String[] sortByLength(String text) {
        String[] words = splitText(text);
        Arrays.sort(words, Comparator.comparing(String::length));
        return words;
    }
}
