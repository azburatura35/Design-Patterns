package abstractfactory.factory;

public interface AbstractFactory<T> {

    <E extends Enum<E>>T create(E enumObject);

}
