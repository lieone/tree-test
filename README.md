# tree-test
Простое тестовое задание на понимание алгоритмов
### Часто задаваемые вопросы
1. *Что нужно сделать?* 
 
 Требуется написать алгоритм поиска максимальной глубины дерева. 
  На вход алгоритма подаётся произвольный узел дерева.
  На выходе алгоритм возвращает число - максимальную глубину дерева, к которому принадлежит переданный узел.
2. *Куда писать код?* 

 Вам надо реализовать метод:
 ```java
public static int getMaxTreeDepth(Node arbitraryNode) {
     // TODO: нужно посчитать максимальную грубину дерева, в котором находится переданный узел
     return 0;
 }
 ```
 Метод расположен в [`tree-test/src/app/Main.java`](https://github.com/kaluchi/tree-test/blob/master/src/app/Main.java) 
3. *У вас ДЕРЕВО или ЛЕС?*
 
 У вас ДЕРЕВО. Корень один. 

4. *Какие ещё ограничения?*  
 * В метод передается только узел. Не дерево а узел.
 * Т.к. это дерево, а не лес, то ЛЮБОЙ узел будет принадлежать дереву.
 * Передается ЛЮБОЙ узел (не обязательно корень).
 * Подсчитать надо **МАКСИМАЛЬНУЮ** глубину дерева.
 * Расширять интерфейс `app.Node` нельзя.
5. *Разрешено ли создавать свои методы/классы/файлы?*

  Разрешено.
5. *В какой среде разработки писать код?*

 На ваше усмотрение.


 
