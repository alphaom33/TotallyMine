(ns main (:import [java.io File] [java.io FileReader]))

(def file (File. "code/main.dym"))
(def reader (FileReader. file))

(println (.getEncoding reader))

(def yes (char-array 10))
(println (.read reader yes 0 10))
(println (seq yes)) ; file reading successful

(.close reader)