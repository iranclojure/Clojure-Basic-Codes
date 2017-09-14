(ns binding.core)

(def myname "myname");You can access symbols that are defined by "def" keyword in all program.
(defn -main []
  (println myname)
  (let [yourname "yourname"];you can access symbols that are defined by "let" only in let scope
    (println yourname)
    );end of let scope
  ;(println yourname) ;uncomment this code and check , you will get an error while compiling
  )
