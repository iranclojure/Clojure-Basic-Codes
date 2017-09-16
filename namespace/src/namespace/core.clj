(ns namespace.core
  (:require [namespace.module :as module]);if you don't use :as you should use full namespace  
  )

(defn -main
  []
  (module/module_func)
  )
