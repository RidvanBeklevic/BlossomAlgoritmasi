# BlossomAlgoritmasi
Blossom algoritması  bir grafikteki maksimum eşleştirme problemini çözmek için kullanılır.
Grafikler, noktalar ve bu noktaları birleştiren kenarlardan oluşan bir yapılardır. Maksimum eşleştirme problemi ise verilen bir grafikte,
 mümkün olan en fazla sayıda noktanın tek bir kenarla birleştirilmesiyle oluşan eşleştirmeyi bulmaktır.

Blossom algoritması, eşleştirme problemini çözmek için iki adımdan oluşur:

1. Artan yolların bulunması: İlk adımda, grafikteki artan yollar bulunur. Artan yollar, 
grafikte bir çift eşleştirme yaparak elde edilebilen, birbirine bağlı noktalardan oluşan bir yoludur. 
Bu adım, mevcut bir eşleştirmeyle başlar ve artan yollar bulunana kadar devam eder.

2. Geliştirilmiş eşleştirmelerin bulunması: İkinci adımda, artan yollar kullanılarak eşleştirmeler geliştirilir. 
Bu adımda, grafikteki "büyüyen" (blossom) döngüleri kullanarak daha büyük bir eşleştirme elde edilir.

Blossom algoritması, grafikteki bir döngüyü "büyüten" bir teknik kullanır. Bu döngüler, grafikteki belli bir alt kümesini temsil eder.
 Algoritma, bir döngüyü birleştirerek, daha büyük bir döngü oluşturur ve böylece eşleştirme problemini daha etkili bir şekilde çözer.

Blossom algoritması, eşleştirme problemlerinin yanı sıra, 
grafiklerdeki en kısa yol ve maksimum akış problemlerini de çözmek için kullanılabilir.
Ancak, algoritma daha büyük grafiklerde zaman alıcı olabilir ve daha hızlı algoritmalara kıyasla daha yavaş çalışabilir.

Blossom algoritması, en kötü durumda O(V^3) zaman karmaşıklığına sahiptir, burada V grafikteki düğümlerin sayısını temsil eder.
 Ancak, çoğu durumda, algoritma daha iyi performans gösterir ve ortalama zaman karmaşıklığı O(EV^2) veya O(E^2V^2/3) seviyelerinde olabilir.

En kötü durum karmaşıklığı için, algoritma grafikte bir çift eşleştirme yaparak başlar ve ardından artan yolları bulmak için O(V^2) işlem yapar.
Artan yolları bulduktan sonra, blossom döngüleri tespit edilerek yeni bir çift eşleştirme oluşturmak için O(V) işlem yapılır.
Bu işlem, blossom döngülerinin genişliği V'ye kadar büyüyebileceği için O(V^3) zaman alabilir.

Ortalama durum karmaşıklığı ise, genellikle daha iyi performans gösterir. Bu durumda, artan yolların sayısı O(V) veya daha azdır ve blossom döngüleri de O(V) veya daha kısadır. Bu nedenle, blossom döngüleri üzerindeki işlemler O(V^2) veya daha az bir zaman alır ve bu nedenle toplam zaman karmaşıklığı O(EV^2) veya O(E^2V^2/3) olabilir.

En iyi durum karmaşıklığı ise, eşleştirmenin başlangıçta yapılması durumudur. Bu durumda, algoritmanın zaman karmaşıklığı sadece O(E) olacaktır.

Blossom algoritmasının zaman karmaşıklığı, artan yolları bulmak için kullanılan Breadth-First Search (BFS) algoritmasının zaman karmaşıklığına dayanmaktadır. 
BFS, genellikle grafikteki düğümlerin sayısına ve kenarların sayısına bağlı olarak O(V+E) zaman karmaşıklığına sahiptir. Bu nedenle, Blossom algoritmasının en kötü durum zaman karmaşıklığı O(V^3) olurken, 
ortalama durum karmaşıklığı O(EV^2) veya O(E^2V^2/3) olabilmektedir.
