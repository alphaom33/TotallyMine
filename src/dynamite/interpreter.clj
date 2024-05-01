(ns dynamite.interpreter)

(def num-regex #"(((\d+(_(\d+))*)+.)?(\d+(_(\d+))*)+i?([eE]\d+)?)|(0b[01]*.?[01]+i?)|(0o[0-7]*.?[0-7]+i?)|(0x[0-9a-fA-F]*.?[0-9a-fA-F]+i?)")
(def intentifier-regex #"[a-zA-Z_][0-9a-zA-Z_]*")
(def space-regex #"\w*\n\w*")