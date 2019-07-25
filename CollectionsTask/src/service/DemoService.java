package service;

import service.CollectionServiceImpl;

import java.util.Arrays;

public class DemoService {
    public void start() {
        CollectionServiceImpl collectionService = new CollectionServiceImpl();
        String text = "Ровно 1000 знаков будет в этом абзаце. В действительности 1000 знаков - это в одном случае более" +
                " чем достаточно, в другом - слишком мало, в третьем - даже слишком много. Согласитесь, заголовок длиной " +
                "в 15 предложений выглядел бы странно. А рассказ с предысторией, интригой и развязкой в тысячу знаков уложить " +
                "сможет только очень талантливый писатель. В среднем тысяча знаков - это хорошее развернутое описание товара " +
                "в каталоге. В такой объем уместится и подробная характеристика, и область применения, и особенности данной модели, " +
                "и даже на призывающий рекламный абзац место останется. Если оценивать на глаз, то текст в 1000 знаков " +
                "(без пробелов) - это примерно половина страницы А4 шрифтом Times NewRoman размером 12 пт с полуторным интервалом. " +
                "Если вам ничего не говорят эти параметры, то просто поверьте на слово: это примерно полстраницы привычного " +
                "вам текста. Теперь следующий вопрос: когда 1000 символов мало? Если для описания товара 700-1000 " +
                "знаков вполне достаточно, то текст на страницу сайта нужно писать побольше объемом. Объем в 2000-3000 " +
                "знаков - это добротная статья, достаточная для раскрытия темы. Минимальный рекомендуемый объем статьи - " +
                "около 1500 знаков.";
        System.out.println("Amount of repeats");
        System.out.println(collectionService.amountOfRepeats(text));

        System.out.println();
        System.out.println("Unique words");
        System.out.println(collectionService.uniqueWords(text));

        System.out.println();
        System.out.println("Sort by alphabet");
        System.out.println(Arrays.toString(collectionService.sortByAlphabet(text)));

        System.out.println();
        System.out.println("Sort by length");
        System.out.println(Arrays.toString(collectionService.sortByLength(text)));
    }
}
