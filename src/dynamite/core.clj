(ns dynamite.core
  (:gen-class)
  (:require
   [dynamite.interpreter :as interpreter]
   [dynamite.reader :as reader])
  )

(defn -main [& args]
  (println "Hello, World!")
  ;(println (reader/readFile "code/main.dym"))
  ;(println (interpreter/lex "funcname(){}\nfuncname():\n  # pass\nfuncname = (){}\n\nfuncname() = return\nfuncname = ()->return\n100_0\n\",cvnx\""))
  (let
    [file (reader/readFile "code/main.dym")]
    (println file)
    (println "-----------------")
    (println (interpreter/lex file))
  ) ;nothing happened dont worry
)