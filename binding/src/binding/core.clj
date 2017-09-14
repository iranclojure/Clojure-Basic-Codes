(ns binding.core)
;defn will create a function
;always main function starts the program

(defn learn-let []
  (let [learnlet "learnlet"];you can access symbols that are defined by "let" only in let scope
    (println learnlet)
    );end of let scope
  ;(println yourname) ;uncomment this code and check , you will get an error while compiling    (println hisname)
  )


(defn learn-def []
  (def learndef "learndef");You can access symbols that are defined by "def" keyword in whole scope of the function.
  (println learndef)
  )

(defn -main []
  (learn-def)
  (learn-let)
  )
