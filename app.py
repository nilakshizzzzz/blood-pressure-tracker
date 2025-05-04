from flask import Flask, render_template, request, redirect

app = Flask(__name__)

# Store data in a simple list (temporary storage)
bp_readings = []

@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == 'POST':
        systolic = request.form['systolic']
        diastolic = request.form['diastolic']
        date = request.form['date']
        bp_readings.append({'systolic': systolic, 'diastolic': diastolic, 'date': date})
        return redirect('/')
    return render_template('index.html', readings=bp_readings)

if __name__ == '__main__':
    app.run(debug=True)
