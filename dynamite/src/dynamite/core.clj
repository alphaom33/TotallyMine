(ns dynamite.core
  (:gen-class)
  (:require
   [dynamite.interpreter :as interpreter]
   [dynamite.reader :as reader])
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println (reader/readFile "../code/main.dym")))