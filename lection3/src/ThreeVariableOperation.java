@FunctionalInterface
public interface ThreeVariableOperation<T extends Number> {
    T operation(T a, T b, T c);
}
