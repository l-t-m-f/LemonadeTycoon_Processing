package src.singleton;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.Class;

abstract public class Singleton {

  private static final HashMap<Class<?>, Singleton> _instances = new HashMap<>(10);

  protected Singleton() {
  }

  // Getters

  private static HashMap<Class<?>, Singleton> getInstances() {
    return _instances;
  }

  // Class methods

  
  @SuppressWarnings("Cast")
  public static <T extends Singleton> T GetInstance(Class<T> singletonType)
      throws InvocationTargetException, InstantiationException, IllegalAccessException, IllegalArgumentException, SecurityException {
    final ReentrantLock multitonLock = new ReentrantLock();
    multitonLock.lock();
    try {
      Singleton instance;
      Constructor<?> singletonConstructor;
      try {
        if (getInstances().containsKey(singletonType) == false) {
          singletonConstructor = singletonType.getDeclaredConstructors()[0];
          instance = (Singleton) singletonConstructor.newInstance();
          getInstances().put(singletonType, instance);
        }
        return (T) getInstances().get(singletonType);
      } catch (InvocationTargetException | InstantiationException | IllegalAccessException | IllegalArgumentException | SecurityException e) {
        System.out
            .println(e.getClass().getSimpleName() + ": Singleton was not acquired and should be discarded (null).");
        return null;
      }
    } finally {
      multitonLock.unlock();
    }
  }

  @SuppressWarnings("Cast")
  public static <T extends Singleton> T GetInstance(Class<T> singletonType, Object[] constructorParameterValues)
      throws InvocationTargetException, InstantiationException, IllegalAccessException, IllegalArgumentException, SecurityException {
    final ReentrantLock multitonLock = new ReentrantLock();
    multitonLock.lock();
    try {
      Singleton instance;
      Constructor<?> singletonConstructor;
      try {
        if (getInstances().containsKey(singletonType) == false) {
          singletonConstructor = singletonType.getDeclaredConstructors()[0];
          instance = (Singleton) singletonConstructor.newInstance(constructorParameterValues);
          getInstances().put(singletonType, instance);
        }
        return (T) getInstances().get(singletonType);
      } catch (InvocationTargetException | InstantiationException | IllegalAccessException | IllegalArgumentException | SecurityException e) {
        System.out
            .println(e.getClass().getSimpleName() + ": Singleton was not acquired and should be discarded (null).");
        return null;
      }
    } finally {
      multitonLock.unlock();
    }
  }

  @SuppressWarnings("Cast")
  public static <T extends Singleton> T GetInstance(Class<T> singletonType, Class<?>[] constructorParameterTypes,
      Object[] constructorParameterValues)
      throws InvocationTargetException, InstantiationException, IllegalAccessException, IllegalArgumentException,
      NoSuchMethodException, SecurityException {
    final ReentrantLock multitonLock = new ReentrantLock();
    multitonLock.lock();
    try {
      Singleton instance;
      Constructor<?> singletonConstructor;
      try {
        if (getInstances().containsKey(singletonType) == false) {
          singletonConstructor = singletonType.getDeclaredConstructor(constructorParameterTypes);
          instance = (Singleton) singletonConstructor.newInstance(constructorParameterValues);
          getInstances().put(singletonType, instance);
        }
        return (T) getInstances().get(singletonType);
      } catch (InvocationTargetException | InstantiationException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException
          | SecurityException e) {
        System.out
            .println(e.getClass().getSimpleName() + ": Singleton was not acquired and should be discarded (null).");
        return null;
      }
    } finally {
      multitonLock.unlock();
    }
  }
}