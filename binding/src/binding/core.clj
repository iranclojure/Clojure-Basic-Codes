(ns binding.core)

(def hisname "hisname");if you declare your symbol outside a function it will be global

(defn -main []
  (def myname "myname");You can access symbols that are defined by "def" keyword in whole scope of the function.
  (println myname)
  (let [yourname "yourname"];you can access symbols that are defined by "let" only in let scope
    (println yourname)
    );end of let scope
  ;(println yourname) ;uncomment this code and check , you will get an error while compiling    (println hisname)
  (println hisname)
  )
