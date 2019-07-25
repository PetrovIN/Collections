package service;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface CollectionService {
    Map amountOfRepeats(String text);
    Set<String> uniqueWords(String text);
    String[] sortByAlphabet(String text);
    String[] sortByLength(String text);
}
