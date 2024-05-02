(ns dynamite.interpreter
  (:require [clojure.string :as string] )
)

(def num-regex #"((((\d+(_(\d+))*)+\.)?(\d+(_(\d+))*)+i?([eE]\d+)?)|(0b[01]*\.?[01]+i?)|(0o[0-7]*\.?[0-7]+i?)|(0x[0-9a-fA-F]*\.?[0-9a-fA-F]+i?))")
(def identifier-regex #"([^0-9+\-*/\^%=><\\&|@;:,.!?'\"()\[\]{}#~`][^\s+\-*/\^%=><\\&|@;:,.!?'\"()\[\]{}#~`]*)")
(def string-regex #"(`.*`)")
(def symbol-regex #"([+\-*/\^%=><\\&|@;:,.!?'\"~`]+)")
(def comment-regex #"((##.*##)|(#.*\n))")
(def space-regex #"(\s*\n\s*)")

(def token-regex (re-pattern (str num-regex "|" identifier-regex "|" string-regex "|" symbol-regex "|" comment-regex "|" space-regex)))


(defn ignore? [segment]
  (or (string/blank? segment) (= (first segment) "#"))
)

(defn lex [code] (let 
  [matcher (re-matcher token-regex code)
   split (string/split code token-regex -1)
  ]
    (doseq [i (range (count split))]
      (let
        [current (string/triml (nth split i))]
        ;(println (ignore? current))
        (if (ignore? current) (println current) (println "ignored"))
      )
      
      (println (string/trim (first (re-find matcher))))
    )
))