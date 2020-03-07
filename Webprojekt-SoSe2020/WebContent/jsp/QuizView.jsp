<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" media="screen" href="./Beispiel:SELFHTML-Beispiel-Grundlayout.css" />
	<title>Ratespiel</title>
	<style>
	
	body
	{
	background-color: #151414;
	color: #fff;
	
	}

h1 { 
	background: transparent none repeat scroll 0 0 !important;
	
	color: #fff;
}

h2 { 
	
	color: #fff;
}

#detail {
margin-bottom: 0px;
}

input
{
cursor: pointer;
	
	width: 15%;
  background: none;
  border: 2px solid #FF4500;
  color: white;
  padding: 5px;
  font-size: 18px;
  cursor: pointer;
  margin: 12px 0;
  margin-bottom: 0px;

}

input:hover {

background-color: #FF8C00;
	
}

#quiz ul {
	list-style: none;
	margin: 0;
	padding: 0;
	color: #fff;
}

#quiz li {
	margin: 0;
	padding: 0;
	color: #fff;
}

#quiz label {
	display: block;
	background-color: #FF4500;
	border: 2px solid #FF4500;
	border-radius: 0.2em;
	margin: 0.1em 0;
	padding: 1em 2em;
	text-align: start;
	max-width: 33em;
	color: #fff;
	
	
}

#quiz label:hover{
	background-color: #FF8C00;
	color: #fff;
}

#quiz input:checked ~ label,
#quiz input:focus ~ label  {
	background-color: #FF4500;
	border-color: #FF4500;
	color: #fff;
}

#quiz input {
	left: -9999px;
	position: absolute;
	
}

#quiz button:not(.startBtn) {
	display: none;
	width: 15%;
  background: none;
   margin-bottom: 0px;
  
  
  
  
  
  text-decoration: none;
  
  
  
  cursor: pointer;
  
}



button{

width: 10%;


}

#quiz button,
#quiz label {
	cursor: pointer;
	
	width: 15%;
  background: none;
  border: 2px solid #FF4500;
  color: white;
  padding: 5px;
  font-size: 18px;
  cursor: pointer;
  margin: 12px 0;
   margin-bottom: 0px;
}


#quiz button:hover {

background-color: #FF8C00;

	
}

/* listing with solutions */

.question {
	font-weight: normal;
	color: #fff
}

.correct {
	color: #0c0;
}

.wrong {
	color: #c00;
}

.correct:before {
	content: '✓';
	color: #0d0;
}

.wrong:before {
	content: '✗';
	color: #f00;
}

.correct:before,
.wrong:before {
	font: 2em bold;
	padding: 0 0.2em;
}

#scores,
#scores td,
#scores th {
	border: 1px solid black;
	border-collapse: collapse;
	text-align: center;
	color: #fff
}

	</style>
	<script>
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/from#Polyfill
// Production steps of ECMA-262, Edition 6, 22.1.2.1
if (!Array.from) {
  Array.from = (function () {
    var toStr = Object.prototype.toString;
    var isCallable = function (fn) {
      return typeof fn === 'function' || toStr.call(fn) === '[object Function]';
    };
    var toInteger = function (value) {
      var number = Number(value);
      if (isNaN(number)) { return 0; }
      if (number === 0 || !isFinite(number)) { return number; }
      return (number > 0 ? 1 : -1) * Math.floor(Math.abs(number));
    };
    var maxSafeInteger = Math.pow(2, 53) - 1;
    var toLength = function (value) {
      var len = toInteger(value);
      return Math.min(Math.max(len, 0), maxSafeInteger);
    };

    // The length property of the from method is 1.
    return function from(arrayLike/*, mapFn, thisArg */) {
      // 1. Let C be the this value.
      var C = this;

      // 2. Let items be ToObject(arrayLike).
      var items = Object(arrayLike);

      // 3. ReturnIfAbrupt(items).
      if (arrayLike == null) {
        throw new TypeError("Array.from requires an array-like object - not null or undefined");
      }

      // 4. If mapfn is undefined, then let mapping be false.
      var mapFn = arguments.length > 1 ? arguments[1] : void undefined;
      var T;
      if (typeof mapFn !== 'undefined') {
        // 5. else
        // 5. a If IsCallable(mapfn) is false, throw a TypeError exception.
        if (!isCallable(mapFn)) {
          throw new TypeError('Array.from: when provided, the second argument must be a function');
        }

        // 5. b. If thisArg was supplied, let T be thisArg; else let T be undefined.
        if (arguments.length > 2) {
          T = arguments[2];
        }
      }

      // 10. Let lenValue be Get(items, "length").
      // 11. Let len be ToLength(lenValue).
      var len = toLength(items.length);

      // 13. If IsConstructor(C) is true, then
      // 13. a. Let A be the result of calling the [[Construct]] internal method 
      // of C with an argument list containing the single item len.
      // 14. a. Else, Let A be ArrayCreate(len).
      var A = isCallable(C) ? Object(new C(len)) : new Array(len);

      // 16. Let k be 0.
      var k = 0;
      // 17. Repeat, while k < len… (also steps a - h)
      var kValue;
      while (k < len) {
        kValue = items[k];
        if (mapFn) {
          A[k] = typeof T === 'undefined' ? mapFn(kValue, k) : mapFn.call(T, kValue, k);
        } else {
          A[k] = kValue;
        }
        k += 1;
      }
      // 18. Let putStatus be Put(A, "length", len, true).
      A.length = len;
      // 20. Return A.
      return A;
    };
  }());
}

'use strict';
var myQuiz = {
	container: null,

	// helper function
	createElement: function (o) {
		var el, p;

		if (o && (o.tag || o.tagName)) {
			el = document.createElement(o.tag || o.tagName);

			if (o.text || o.txt) {
				var text = (o.text || o.txt)
				el.innerHTML = text;
			}

			for (p in o) {
				if (!p.match(/^t(e)?xt|tag(name)?$/i)) {
					el[p] = o[p];
				}
			}
		}

		return el;
	},

	// user interface for a quiz question
	createOptions: function () {
		var t = this,
			options = [],
			ul = document.createElement("ul");

		t.emptyContainer();

		t.intoContainer(t.createElement({
			tag: "h2",
			text: t.currentQuestion.category + ": " + t.currentQuestion.question
		}));

		t.intoContainer(ul);

		// create options
		options.push(t.currentQuestion.solution);

		t.currentQuestion.falses.forEach(function (s) {
			options.push(s);
		});

		t.shuffleArray(options);

		options.forEach(function (s, i) {
			var li = document.createElement("li"),
			label = t.createElement({
				htmlFor: "a" + t.questions.length + "_" + i,
				tag: "label",
				text: s
			}),
			radio = t.createElement({
				id: "a" + t.questions.length + "_" + i,
				name: "answer",
				tag: "input",
				type: "radio",
				tabindex: "0",
				value: s
			});

			ul.appendChild(li);
			li.appendChild(radio);
			li.appendChild(label);


		});

		// Hinweis für Tastatur-User
		t.intoContainer(t.createElement({
			tag: "button",
			text: "confirm choice",
			type: "submit"
		}));
	},

	currentChoices: [],
	currentQuestion: null,

	// data could be filled from an external source (JSON)
	data: [{
		category: 'Spass',
		question: 'Welcher Prof ist der beste?',
		solution: 'Professor Roeckle',
		falses: ['Professor Bonguard', 'Professor Selchert', 'Herr Sponheimer'],
		explanation: 'Es gibt nur eine Antwort'
	}, {
		category: 'Uni',
		question: 'Wie viele Semester studieren wir?',
		solution: '6',
		falses: ['5', '7', '8'],
		explanation: 'Wir studieren 6 Semester.'
	}, {
		category: 'Prog',
		question: 'Eine Frage?',
		solution: 'richte Antwort',
		falses: ['1. falsche Antwort', '2. falsche Antwort', '3. falsche Antwort'],
		explanation: 'Test Erklärung'
	}],

	emptyContainer: function () {
		var t = this;

		while (t.container.firstChild) {
			t.container.removeChild(t.container.firstChild);
		}
	},

	handleInput: function () {
		var t = this, // t points to myQuiz
			// create real array so we can use forEach
			inputs = Array.from(
				t.container.getElementsByTagName("input")
			),
			selectedSolution = "";

		// determine selection
		inputs.forEach(function (o) {
			if (o.checked) {
				selectedSolution = o.value;
			}
		});

		// process selected answer
		if (selectedSolution && t.currentQuestion) {
			t.currentChoices.push({
				a: selectedSolution,
				q: t.currentQuestion
			});

			t.play();
		}

		// accept start button
		if (!t.currentQuestion) {
			t.play();
		}
	},

	init: function () {
		var t = this;

		// here goes any code for loading data from an external source

		t.container = document.getElementById("quiz");

		if (t.data.length && t.container) {

			// use anonymous functions so in handleInput
			// "this" can point to myQuiz

			t.container.addEventListener(
				"submit",
				function (ev) {
					t.handleInput();
					ev.stopPropagation();
					ev.preventDefault();
					return false;
				}
			);

			t.container.addEventListener(
				"mouseup",
				function (ev) {

					// we want to only support clicks on start buttons...
					var go = ev.target.tagName.match(/^button$/i);

					// ... and labels for radio buttons when in a game
					if (ev.target.tagName.match(/^label$/i)
						&& t.currentQuestion
					) {
						go = true;
					}

					if (go) {

						window.setTimeout(
							function () {
								t.handleInput();
							},
							50
						);

						ev.stopPropagation();
						ev.preventDefault();
						return false;
					}
				}
			);

			t.start();
		}
	},

	intoContainer: function (el, parentType) {
		var t = this,
			parent;

		if (!el) {
			return;
		}

		if (parentType) {

			parent = document.createElement(parentType);
			parent.appendChild(el);

		} else {

			parent = el;
		}

		t.container.appendChild(parent);

		return parent;
	},

	// ask next question or end quiz if none are left
	play: function () {
		var t = this,
			ol;

		// game over?
		if (!t.questions.length) {

			t.showResults();

			// offer restart
			window.setTimeout(
				function () {
					t.start();
				},
				50
			);

			return;
		}

		t.currentQuestion = t.questions.shift();

		t.createOptions();
	},

	// list with remaining quiz question objects
	questions: [],

	// list original questions and given answers and elaborate on solutions
	showResults: function () {
		var cat, ol, s, scores = {}, t = this, tab, thead, tbody, tr;

		t.emptyContainer();

		// show message
		t.intoContainer(t.createElement({
			tag: "p",
			text: "Sie haben alle Fragen des Quiz beantwortet. Hier die Auswertung Ihrer Antworten:"
		}));

		// list questions and given answers
		ol = t.intoContainer(t.createElement({
			id: "result",
			tag: "ol"
		}));

		t.currentChoices.forEach(function (o) {
			var p, li = ol.appendChild(t.createElement({
				tag: "li"
			}));

			// list original question
			li.appendChild(t.createElement({
				className: "question",
				tag: "p",
				text: "(" + o.q.category + ") " + o.q.question
			}));

			// list given answer
			p = li.appendChild(t.createElement({
				tag: "p",
				text: "Ihre Antwort: "
			}));

			p.appendChild(t.createElement({
				className: (
					o.q.solution == o.a
					? "correct"
					: "wrong"
				),
				tag: "em",
				text: o.a
			}));

			// wrong answer?
			if (o.q.solution != o.a) {

				p = li.appendChild(t.createElement({
					tag: "p",
					text: "Die richtige Antwort wäre gewesen: "
				}));

				p.appendChild(t.createElement({
					tag: "em",
					text: o.q.solution
				}));
			}

			// elaborate on solution?
			if (o.q.explanation) {

				p = li.appendChild(t.createElement({
					tag: "p",
					text: "Erläuterung: "
				}));

				p.appendChild(t.createElement({
					tag: "em",
					text: o.q.explanation
				}));
			}
		});

		// display a kind of percentual score over the categories
		cat = [];

		t.currentChoices.forEach(function (o) {
			if (!cat.includes(o.q.category)) {
				cat.push(o.q.category);
			}
		});

		cat.sort();

		cat.forEach(function (c) {
			var correct = 0, num = 0;

			t.currentChoices.forEach(function (o) {

				if (o.q.category == c) {

					num++;

					if (o.q.solution == o.a) {
						correct++;
					}
				}
			});

			scores[c] = Math.floor(100 * correct / num) + "%";
		});

		tab = t.intoContainer(t.createElement({
			id: "scores",
			tag: "table"
		}));

		tab.appendChild(t.createElement({
			tag: "caption",
			text: "Übersicht nach Kategorien"
		}))

		thead = tab.appendChild(t.createElement({
			tag: "thead"
		}))

		tr = thead.appendChild(t.createElement({
			tag: "tr"
		}))

		for (s in scores) {
			tr.appendChild(t.createElement({
				tag: "th",
				text: s
			}));
		}

		tbody = tab.appendChild(t.createElement({
			tag: "tbody"
		}))

		tr = tbody.appendChild(t.createElement({
			tag: "tr"
		}))

		for (s in scores) {
			tr.appendChild(t.createElement({
				tag: "td",
				text: scores[s]
			}));
		}

		// show message
		t.intoContainer(t.createElement({
			tag: "p",
			text: "Nochmal spielen?"
		}));
	},

	// helper function: shuffle array (adapted from http://javascript.jstruebig.de/javascript/69)
	shuffleArray: function (a) {
		var i = a.length;

		while (i >= 2) {
			var zi = Math.floor(Math.random() * i);
			var t = a[zi];
			a[zi] = a[--i];
			a[i] = t;
		}
		// no return argument since the array has been
		// handed over as a reference and not a copy!
	},

	// start quiz with a start button
	start: function () {
		var t = this;

		// fill list of remaining quiz questions
		t.questions = [];

		t.data.forEach(function (o) {
			t.questions.push(o);
		});

		t.shuffleArray(t.questions);

		t.currentChoices = [];
		t.currentQuestion = null;

		// install start button
		t.intoContainer(
			t.createElement({
				className: "startBtn",
				tag: "button",
				text: "Jetzt Starten!"
			}),
			"p"
		);
	}
};

document.addEventListener("DOMContentLoaded", function () {
	myQuiz.init();
});
	</script>
</head>

<body>
	<h1>Quiz | lazyNerds</h1>

	<main id="main">

		<form id="quiz" action="">
			<h2 id="intro">Viel Spass beim Spielen!</h2>
		</form>
	</main>
	
	<form action="./QuizAppl.jsp" method="get">
	
	<input type="submit"value="Zurueck zu Home" name="zurück" id="detail"> 
	
	</form>


</body>

</html>