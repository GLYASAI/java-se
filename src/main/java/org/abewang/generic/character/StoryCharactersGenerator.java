package org.abewang.generic.character;

import net.mindview.util.Generator;

import java.util.Iterator;
import java.util.Random;

/**
 * StoryCharacters的生成器
 *
 * @Author Abe
 * @Date 2018/5/12.
 */
public class StoryCharactersGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters> {
    private Integer n;
    private Class[] types = {BlackWidow.class, IronMan.class, Spiderman.class};
    private Random rand = new Random(47);

    public StoryCharactersGenerator() {
    }

    public StoryCharactersGenerator(Integer n) {
        this.n = n;
    }

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new StoryCharactersIterator();
    }

    class StoryCharactersIterator implements Iterator<StoryCharacters> {
        @Override
        public boolean hasNext() {
            return n > 0;
        }

        @Override
        public StoryCharacters next() {
            try {
                n--;
                return StoryCharactersGenerator.this.next();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        StoryCharactersGenerator gen = new StoryCharactersGenerator();
        for (int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for(StoryCharacters scg : new StoryCharactersGenerator(5)) {
            System.out.println(scg);
        }
    }
}
